package defpackage;

import android.net.Uri;
import java.io.File;

/* renamed from: agmr */
public final class agmr extends oxf {
    public final Uri g;

    public agmr(String str, long j, Uri uri) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 8);
        stringBuilder.append("/ytb/");
        stringBuilder.append(str);
        stringBuilder.append(".yt");
        super(str, 0, j, -9223372036854775807L, new File(stringBuilder.toString()));
        this.g = uri;
    }
}
