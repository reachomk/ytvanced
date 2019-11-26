package com.google.android.libraries.stitch.sslguard;

import android.util.Log;
import defpackage.uho;
import defpackage.uhs;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

public final class SslGuardSocketFactory extends SSLSocketFactory {
    private static final String a = SslGuardSocketFactory.class.getSimpleName();
    private static uhs b;

    private static SSLSocketFactory a() {
        try {
            return SSLContext.getInstance("Default").getSocketFactory();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static SSLSocketFactory b() {
        b.a(uho.a);
        SSLSocketFactory a = a();
        if (!(a instanceof SslGuardSocketFactory)) {
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

    public final Socket createSocket() {
        return b().createSocket();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return b().createSocket(socket, str, i, z);
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return b().createSocket(inetAddress, i, inetAddress2, i2);
    }

    public final Socket createSocket(InetAddress inetAddress, int i) {
        return b().createSocket(inetAddress, i);
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return b().createSocket(str, i, inetAddress, i2);
    }

    public final Socket createSocket(String str, int i) {
        return b().createSocket(str, i);
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
