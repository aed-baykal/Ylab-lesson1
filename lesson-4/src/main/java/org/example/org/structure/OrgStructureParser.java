package org.example.org.structure;

import java.io.File;
import java.io.IOException;

public interface OrgStructureParser {
    public Employee parseStructure(File csvFile) throws IOException;
}
