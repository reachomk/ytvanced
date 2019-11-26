package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executors;

/* renamed from: agru */
public final class agru extends aivi implements agsu {
    public static agru a(Key key, afhg afhg, afhg afhg2, xsc xsc, boolean z) {
        int i = 0;
        while (i < 2) {
            try {
                InetAddress byAddress;
                agru agru = new agru(key, afhg, afhg2, xsc, z);
                agru.f = new ServerSocket();
                ServerSocket serverSocket = agru.f;
                String str = "loopback";
                if (agru.e) {
                    byAddress = InetAddress.getByAddress(str, new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 1});
                } else {
                    byAddress = InetAddress.getByAddress(str, new byte[]{Byte.MAX_VALUE, (byte) 0, (byte) 0, (byte) 1});
                }
                serverSocket.bind(new InetSocketAddress(byAddress, 0));
                agru.g = Executors.newSingleThreadExecutor(new xaf("mediaReq"));
                agru.g.execute(new aivl(agru));
                return agru;
            } catch (IOException e) {
                xtl.a("IOException starting MediaServer", e);
            } catch (NoSuchAlgorithmException e2) {
                xtl.b("NoSuchAlgorithmException starting MediaServer", e2);
                i++;
            } catch (GeneralSecurityException e3) {
                xtl.a("GeneralSecurityException starting MediaServer", e3);
            }
        }
        return null;
    }

    private agru(Key key, afhg afhg, afhg afhg2, xsc xsc, boolean z) {
        super(key, afhg, z);
        this.c.register("/pudl", new agtq(xsc, afhg2));
    }

    public final Uri a(String str, int i, String str2, long j, long j2, long j3) {
        aivk a = a("/pudl", str, i, str2, j, j2);
        a.a("e", j3);
        return a.a();
    }
}
