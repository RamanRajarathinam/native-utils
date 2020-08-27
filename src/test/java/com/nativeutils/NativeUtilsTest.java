package com.nativeutils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class NativeUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testLoadLibraryIllegalPath() throws IOException {
        com.nativeutils.NativeUtils.loadLibraryFromJar("libtest.so");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoadLibraryIllegalPrefix() throws IOException {
        com.nativeutils.NativeUtils.loadLibraryFromJar("/l");
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoadLibraryNonExistentPath() throws IOException {
        com.nativeutils.NativeUtils.loadLibraryFromJar("/libtest.so");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoadLibraryNullPath() throws IOException {
        com.nativeutils.NativeUtils.loadLibraryFromJar(null);
    }
}
