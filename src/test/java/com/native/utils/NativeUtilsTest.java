package cz.adamh.utils;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

public class NativeUtilsTest {

    @Test(expected = IllegalArgumentException.class)
    public void testLoadLibraryIllegalPath() throws IOException {
        cz.adamh.utils.NativeUtils.loadLibraryFromJar("libtest.so");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoadLibraryIllegalPrefix() throws IOException {
        cz.adamh.utils.NativeUtils.loadLibraryFromJar("/l");
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoadLibraryNonExistentPath() throws IOException {
        cz.adamh.utils.NativeUtils.loadLibraryFromJar("/libtest.so");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLoadLibraryNullPath() throws IOException {
        cz.adamh.utils.NativeUtils.loadLibraryFromJar(null);
    }
}
