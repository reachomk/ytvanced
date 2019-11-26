package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;

/* renamed from: bahl */
public final class bahl {
    public static Uri a(String str, String str2) {
        return new Builder().scheme("content").authority(str).path(str2).build();
    }
}
