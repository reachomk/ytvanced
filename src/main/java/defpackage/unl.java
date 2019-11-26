package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.io.OutputStream;
import java.util.Date;

/* renamed from: unl */
public final class unl extends Thread {
    public volatile Exception a;
    private final Context b;
    private final OutputStream c;
    private final Uri d;
    private final long e;
    private final Uri f;
    private final long g;
    private final float h;
    private final long i;
    private final boolean j;
    private final uju k;

    public unl(Context context, OutputStream outputStream, Uri uri, long j, Uri uri2, long j2, float f, long j3, boolean z, uju uju) {
        long j4 = j3;
        uhy.a(j4 >= 0);
        this.b = (Context) uhy.a((Object) context);
        this.c = (OutputStream) uhy.a((Object) outputStream);
        this.d = uri;
        this.e = j;
        this.f = (Uri) uhy.a((Object) uri2);
        this.g = j2;
        this.h = f;
        this.i = j4;
        this.j = z;
        this.k = uju;
    }

    public final void run() {
        ujz a;
        Looper.prepare();
        Date date = new Date(0);
        Looper looper = (Looper) uhy.a(Looper.myLooper());
        nlp a2 = nlr.a();
        nlp a3 = nlr.a();
        unk unk = new unk(a2, a3, looper);
        a2.a(new unm(this, a3, a2, looper));
        a3.a(new unp(this, a2, a3, looper));
        ujs ujs = new ujs(new ujq(new ujx(this.c, date, unk)), this.i, this.k);
        Uri uri = this.d;
        if (uri != null) {
            a = unl.a(this.e, 1.0f - this.h, ujs, unl.a(this.b, uri, this.j, 16777216));
            a2.a(a);
            a2.a(true);
        }
        a = unl.a(this.g, this.h, ujs, unl.a(this.b, this.f, this.j, 1310720));
        ujs.b = ujt.STARTED;
        a3.a(a);
        a3.a(true);
        Looper.loop();
    }

    private static ujz a(long j, float f, ujs ujs, nne nne) {
        ujz ujz = new ujz(nne);
        uhy.b(ujs.b == ujt.NOT_STARTED, "Invalid mixer status (%s)", ujs.b);
        ujw ujw = new ujw(ujs, f);
        ujw.a((j * 7056000) / 1000000);
        ujs.a.add(ujw);
        ujz.a = ujw;
        return ujz;
    }

    private static nne a(Context context, Uri uri, boolean z, int i) {
        if (!z) {
            return new nly(context, uri);
        }
        return new nrd(uri, new nvr(context, nxf.a(context, "AudioMPEG")), new nvp(65536), i, new nrc[0]);
    }
}
