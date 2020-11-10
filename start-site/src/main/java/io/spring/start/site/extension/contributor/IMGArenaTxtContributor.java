package io.spring.start.site.extension.contributor;

import io.spring.initializr.generator.project.contributor.ProjectContributor;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class IMGArenaTxtContributor implements ProjectContributor {

    static final String RESOURCES = "src/main/resources/";

    @Override
    public void contribute(Path projectRoot) throws IOException {
        Files.createDirectories(projectRoot.resolve(RESOURCES));
        Path file = Files.createFile(projectRoot.resolve(RESOURCES + "imgarena.txt"));
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            writer.println("IMGArena");
        }
    }

}
