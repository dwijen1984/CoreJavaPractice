package com.dwijen.cyclic.barrie.practise;

public enum DealSource implements LookupInterface{
    DEAL_UI("DEALS UI"),
    SELLPO("SELLPO"),
    SYSTEM("SYSTEM");

    private final String displayName;

    DealSource(String displayName){
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return displayName;
    }

    public String getDbId() {
        return getDbId("DEAL_SOURCE_ID", displayName);
    }

    public String getName() {
        return name();
    }

    public static DealSource byDbId(String dbId){
        for (DealSource dealSource : DealSource.values()){
            if (dealSource.getDbId().equals(dbId)){
                return dealSource;
            }
        }
        return null;
    }

    public static DealSource byName(String name){
        for (DealSource dealStatus : DealSource.values()){
            if (dealStatus.displayName.equalsIgnoreCase(name)){
                return dealStatus;
            }
        }
        return null;
    }


    public String getValue() {
        return String.valueOf(ordinal() + 1);
    }
}
