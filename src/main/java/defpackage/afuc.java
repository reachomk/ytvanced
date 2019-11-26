package defpackage;

import android.content.ContentValues;
import android.net.Uri;

/* renamed from: afuc */
final /* synthetic */ class afuc implements Runnable {
    private final afua a;
    private final int b;
    private final String c;
    private final ContentValues d;
    private final String e;
    private final String f;

    afuc(afua afua, int i, String str, ContentValues contentValues, String str2, String str3) {
        this.a = afua;
        this.b = i;
        this.c = str;
        this.d = contentValues;
        this.e = str2;
        this.f = str3;
    }

    public final void run() {
        afua afua = this.a;
        int i = this.b;
        String str = this.c;
        ContentValues contentValues = this.d;
        String str2 = this.e;
        String str3 = this.f;
        if (i <= 0) {
            try {
                String concat = String.valueOf(str2).concat("=?");
                afua.a.update(Uri.parse(str), contentValues, concat, new String[]{str3});
            } catch (IllegalArgumentException unused) {
            }
        } else {
            afua.a.insert(Uri.parse(str), contentValues);
        }
    }
}
