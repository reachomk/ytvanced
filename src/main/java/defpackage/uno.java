package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: uno */
public final class uno {
    public static final Set a;
    public final Context b;
    public final Uri c;
    public final unq d;
    public final int e;
    public final Uri f;
    public final float g;
    public final long h;
    public final uju i;
    public final boolean j;
    public final boolean k;
    private final File l;

    public uno(Context context, File file, Uri uri, long j, long j2, Uri uri2, float f, long j3, uju uju, unr unr, boolean z) {
        this.b = context;
        if (file == null) {
            file = context.getCacheDir();
        }
        this.l = file;
        this.c = uri;
        this.f = uri2;
        this.g = f;
        this.h = j3;
        this.i = uju;
        this.j = unr.a;
        this.d = new unq(j, j2);
        this.e = 0;
        this.k = z;
    }

    public static cil a(Context context, Uri uri) {
        bakq a = ujn.a(context, uri);
        try {
            return new cil(a, ukc.a);
        } catch (IOException e) {
            a.close();
            throw e;
        }
    }

    public static boolean a(ckg ckg) {
        cjh h = ckg.h();
        if (h != null) {
            cjj a = h.a();
            if (a != null) {
                cip cip;
                for (cis cis : a.b()) {
                    if (cis instanceof cip) {
                        cip = (cip) cis;
                        break;
                    }
                }
                cip = null;
                return cip instanceof cjv;
            }
        }
        return false;
    }

    public final Uri a(String str) {
        return Uri.fromFile(this.l).buildUpon().appendPath(str).build();
    }

    public static bakw a(int i, ckg ckg) {
        StringBuilder stringBuilder = new StringBuilder(17);
        stringBuilder.append("track-");
        stringBuilder.append(i);
        return new bakw(stringBuilder.toString(), ckg, new cil[0]);
    }

    public static long a(long[] jArr, long j, long j2, boolean z) {
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            binarySearch = Math.max(0, (binarySearch ^ -1) - 1);
        }
        if (!z) {
            binarySearch++;
        }
        return binarySearch < jArr.length ? jArr[binarySearch] : j;
    }

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add("vide");
        a.add("soun");
    }
}
