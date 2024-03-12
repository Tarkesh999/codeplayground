package com.lld.designpatterns.structural.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.lld.utils.ConsolePrint.printLog;

@Getter
@Setter
public class CompositeDirectory implements FileStructure{

    List<FileStructure> fileStructures;

    public CompositeDirectory(){
        fileStructures = new ArrayList<>();
    }
    public void addDirectory(FileStructure fileStructure){
        fileStructures.add(fileStructure);
    }

    public void removeDirectory(FileStructure fileStructure){
        fileStructures.remove(fileStructure);
    }

    @Override
    public void printDirectory() {
        printLog("Printing the directory----- D"+ UUID.randomUUID());
        fileStructures.forEach(FileStructure::printDirectory);
    }
}
