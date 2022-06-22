/*
 * Copyright (C) 2022 Bruno Riemenschneider <bruno.riemenschneider@fau.de>; Zhengguo Tan <zhengguo.tan@fau.de>; Jinho Kim <jinho.kim@fau.de>
 *
 * Distributed under terms of the GPLv3 license.
 */
package project;

import lme.DisplayUtils;
import mt.Signal;
import mt.Image;

import java.util.Arrays;

public class Project {
    public static void main(String[] args) {
        (new ij.ImageJ()).exitWhenQuitting(true);
        ComplexImage kSpace = ProjectHelpers.LoadKSpace("kdata.h5");

        /* Implement your code based on the project description */
    }
}
