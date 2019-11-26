package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: gjd */
public final class gjd {
    public final Map a = Collections.synchronizedMap(new HashMap());
    public final akkq b;
    public final ehv c;
    public final Executor d;
    public final gjm e;
    public int f = 3;
    private final Map g = Collections.synchronizedMap(new HashMap());

    public gjd(Context context, akkq akkq, Executor executor, gjm gjm) {
        this.b = akkq;
        this.d = executor;
        this.e = gjm;
        this.c = new ehv(context);
    }

    public final void a(Uri uri, wxg wxg) {
        if (uri == null) {
            wxg.a(null, new NullPointerException());
        } else if (this.g.containsKey(uri)) {
            try {
                wxg.a((Object) uri, this.c.a((byte[]) this.g.get(uri)));
            } catch (xwd e) {
                wxg.a((Object) uri, e);
            }
        } else {
            wxi a = wxi.a(wxg);
            this.a.put(uri, a);
            this.d.execute(new gjc(this, uri, this.f, a, wxg));
        }
    }

    public final void a(Uri uri, byte[] bArr) {
        this.g.put(uri, bArr);
    }

    public static byte[] a(byte[] bArr, int i) {
        Options options = new Options();
        options.inSampleSize = i;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        xln xln = new xln();
        decodeByteArray.compress(CompressFormat.PNG, 100, xln);
        return xln.toByteArray();
    }

    public static boolean a(Uri uri) {
        return uri.getLastPathSegment().endsWith(".png");
    }
}
