package com.salesforce;

import java.util.List;

public class InstalledPackage {
    public String Name;
    public List<Package> Dependencies;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Package> getDependencies() {
        return Dependencies;
    }

    public void setDependencies(List<Package> dependencies) {
        Dependencies = dependencies;
    }
}
