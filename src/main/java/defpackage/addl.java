package defpackage;

import java.io.IOException;
import java.net.MulticastSocket;
import java.util.Locale;

/* renamed from: addl */
public final class addl implements addm {
    private static final String a = xtl.b("MDX.SocketFactory");

    public final MulticastSocket a(xhr xhr) {
        return addl.a(xhr, null);
    }

    public final MulticastSocket b(xhr xhr) {
        return addl.a(xhr, Integer.valueOf(262144));
    }

    private static MulticastSocket a(xhr xhr, Integer num) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            multicastSocket.setNetworkInterface(xhr.a);
            if (num != null) {
                multicastSocket.setReceiveBufferSize(num.intValue());
            }
            multicastSocket.setBroadcast(true);
            return multicastSocket;
        } catch (IOException e) {
            xtl.a(a, String.format(Locale.US, "Error creating socket on interface %s", new Object[]{xhr.c()}), e);
            return null;
        }
    }
}
