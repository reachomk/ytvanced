package com.google.android.libraries.stitch.sslguard;

import android.util.Log;
import defpackage.uho;
import defpackage.uhs;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;

public final class SslGuardServerSocketFactory extends SSLServerSocketFactory {
    private static final String a = SslGuardSocketFactory.class.getSimpleName();
    private static uhs b;

    private static SSLServerSocketFactory a() {
        try {
            return SSLContext.getInstance("Default").getServerSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static SSLServerSocketFactory b() {
        b.a(uho.a);
        SSLServerSocketFactory a = a();
        if (!(a instanceof SslGuardServerSocketFactory)) {
            return a;
        }
        Object obj = "[";
        for (Provider provider : Security.getProviders()) {
            Object str;
            String valueOf = String.valueOf(obj);
            String valueOf2 = String.valueOf(provider.toString());
            if (valueOf2.length() == 0) {
                str = new String(valueOf);
            } else {
                str = valueOf.concat(valueOf2);
            }
            if (provider.stringPropertyNames().contains("SSLContext.Default")) {
                obj = String.valueOf(str).concat("(true), ");
            } else {
                obj = String.valueOf(str).concat("(false), ");
            }
        }
        Log.e(a, String.valueOf(obj).concat("]"));
        throw new RuntimeException("Unable to find a default SSL provider.");
    }

    public static void a(uhs uhs) {
        if (uhs != null) {
            b = uhs;
            return;
        }
        throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
    }

    public final ServerSocket createServerSocket(int i) {
        return b().createServerSocket(i);
    }

    public final ServerSocket createServerSocket(int i, int i2) {
        return b().createServerSocket(i, i2);
    }

    public final ServerSocket createServerSocket(int i, int i2, InetAddress inetAddress) {
        return b().createServerSocket(i, i2, inetAddress);
    }

    public final String[] getSupportedCipherSuites() {
        try {
            return b().getSupportedCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final String[] getDefaultCipherSuites() {
        try {
            return b().getDefaultCipherSuites();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
