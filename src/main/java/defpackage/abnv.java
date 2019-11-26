package defpackage;

import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: abnv */
public final class abnv implements Comparable {
    public static final int i = 1;
    public static final int j = 19;
    public static final int k = 2;
    public static final int l = 23;
    private static final Pattern n = Pattern.compile("&nbsp;", 16);
    public final String a;
    public final String b;
    public final int c;
    public final int[] d;
    public final String e;
    public final int f;
    public final String g;
    public final Spanned h;
    public final int m;
    private final int o;

    public final boolean a() {
        return this.c == 35 && !TextUtils.isEmpty(this.e);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof abnv)) {
            return false;
        }
        abnv abnv = (abnv) obj;
        if (this.c != abnv.c) {
            return false;
        }
        return TextUtils.equals(this.a, abnv.a);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        abnv abnv = (abnv) obj;
        if (abnv == null) {
            return 0;
        }
        return this.o - abnv.o;
    }

    public abnv(String str, int i) {
        this(str, i, null);
    }

    public abnv(String str, int i, int[] iArr) {
        this(str, 0, i, iArr, null, 0, null, -1, null, null);
    }

    public abnv(String str, int i, int i2, int[] iArr, String str2, int i3, String str3, int i4, String str4, Spanned spanned) {
        this.b = (String) amqw.a((Object) str);
        this.c = i;
        this.m = i2;
        if (iArr == null) {
            iArr = new int[0];
        }
        this.d = iArr;
        this.e = str2;
        this.f = i3;
        this.g = str3;
        this.o = i4;
        this.h = spanned;
        if (i == 33) {
            String replaceAll;
            Object str42;
            str = "… ";
            if (!(str42 == null || str42.isEmpty())) {
                Object fromHtml;
                replaceAll = n.matcher(str42).replaceAll(" ");
                if (VERSION.SDK_INT >= 24) {
                    fromHtml = Html.fromHtml(replaceAll, 63);
                } else {
                    fromHtml = Html.fromHtml(replaceAll);
                }
                str42 = fromHtml.toString();
            }
            replaceAll = String.valueOf(str42);
            if (replaceAll.length() == 0) {
                str = new String(str);
            } else {
                str = str.concat(replaceAll);
            }
        }
        this.a = str;
    }
}
