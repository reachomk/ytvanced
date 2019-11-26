package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: baxe */
public abstract class baxe extends bauj {
    private static final bbew A = bbhl.a(bbby.l);
    private static final batc B = batc.a;
    private static final basq C = basq.a;
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    private static final long z = TimeUnit.MINUTES.toMillis(30);
    private final boolean D = true;
    private final boolean E = true;
    private final boolean F = true;
    private final boolean G = true;
    public final bbew b = A;
    public final List c = new ArrayList();
    public final bavk d = bavk.a();
    public bave e = this.d.a;
    public final String f;
    public String g;
    public String h;
    public final String i = "pick_first";
    public boolean j;
    public final batc k = B;
    public final basq l = C;
    public final long m = z;
    public final int n = 5;
    public final int o = 5;
    public final long p = 16777216;
    public final long q = 1048576;
    public final boolean r = false;
    public final batm s = batm.a;
    public int t;
    public Map u;
    public final boolean v = true;
    public final bbhw w = bbht.a;
    public barr x;
    public bavs y;

    private static String a(SocketAddress socketAddress) {
        try {
            String valueOf = String.valueOf(socketAddress);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 1);
            stringBuilder.append("/");
            stringBuilder.append(valueOf);
            return new URI("directaddress", "", stringBuilder.toString(), null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract bazp a();

    protected baxe(SocketAddress socketAddress, String str) {
        this.f = baxe.a(socketAddress);
        this.e = new baxd(socketAddress, str);
    }

    public final bauk b() {
        bazp a = a();
        bbbn bbbn = new bbbn();
        bbhl a2 = bbhl.a(bbby.l);
        amro amro = bbby.n;
        ArrayList arrayList = new ArrayList(this.c);
        if (this.D) {
            arrayList.add(0, new bayn(new bayj(bbby.n, this.E, this.F)));
        }
        if (this.G) {
            arrayList.add(0, new bays(bblh.a.a(), bblh.a.b().a()).e);
        }
        return new bbeg(new bbde(this, a, bbbn, a2, amro, arrayList, bbhs.a));
    }
}
