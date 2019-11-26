package defpackage;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/* renamed from: addt */
final class addt implements Runnable {
    private final MulticastSocket a;

    addt(MulticastSocket multicastSocket) {
        this.a = multicastSocket;
    }

    public final void run() {
        try {
            if (addo.j == null) {
                InetAddress byName = InetAddress.getByName("239.255.255.250");
                String hostAddress = byName.getHostAddress();
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(hostAddress).length() + 117);
                stringBuilder.append("M-SEARCH * HTTP/1.1\r\nHOST: ");
                stringBuilder.append(hostAddress);
                stringBuilder.append(":1900\r\nMAN: \"ssdp:discover\"\r\nMX: 1\r\nST: urn:dial-multiscreen-org:service:dial:1\r\n\r\n");
                byte[] bytes = stringBuilder.toString().getBytes();
                addo.j = new DatagramPacket(bytes, bytes.length, byName, 1900);
            }
            this.a.send(addo.j);
        } catch (IOException e) {
            xtl.a(addo.a, "Error sending M-search:", e);
        }
    }
}
