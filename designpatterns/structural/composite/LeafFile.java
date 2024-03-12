package com.lld.designpatterns.structural.composite;

import java.util.UUID;

import static com.lld.utils.ConsolePrint.printLog;

public class LeafFile implements FileStructure{
    @Override
    public void printDirectory() {
         printLog("-- File " + UUID.randomUUID());
    }
}
