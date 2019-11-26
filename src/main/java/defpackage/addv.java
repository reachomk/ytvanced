package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: addv */
public final class addv {
    public static final String a = xtl.b("MDX.WakeOnLan");
    public final aebl b;
    public final addm c;
    public final String d;
    public final Handler e;
    public DatagramPacket f;
    public volatile boolean g;
    private final Runnable h = new addy(this);

    public addv(aebl aebl, String str) {
        this.b = aebl;
        this.c = new addl();
        this.d = str;
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 10);
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }

    public final void a() {
        synchronized (this) {
            if (this.g) {
                return;
            }
            String str = "startBroadcasting for ";
            String valueOf = String.valueOf(this.d);
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            try {
                str = this.d;
                InetAddress byName = InetAddress.getByName("255.255.255.255");
                if (str.length() == 17) {
                    int i;
                    int i2;
                    int length = (str.length() - 2) / 5;
                    byte[] bArr = new byte[6];
                    for (i = 0; i < 6; i++) {
                        i2 = i * length;
                        bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
                    }
                    byte[] bArr2 = new byte[102];
                    for (i = 0; i < 6; i++) {
                        bArr2[i] = (byte) -1;
                    }
                    for (i2 = 1; i2 <= 16; i2++) {
                        System.arraycopy(bArr, 0, bArr2, i2 * 6, 6);
                    }
                    this.f = new DatagramPacket(bArr2, 102, byName, 9);
                    this.g = true;
                    this.e.post(this.h);
                    return;
                }
                throw new NumberFormatException("Mac address should be 17 characters long");
            } catch (UnknownHostException e) {
                xtl.a(a, "Error creating magic packet", e);
            }
        }
    }

    public final void b() {
        String valueOf = String.valueOf(this.d);
        String str = "stopBroadcasting for ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        synchronized (this) {
            this.g = false;
            this.e.removeCallbacks(this.h);
        }
    }
}
