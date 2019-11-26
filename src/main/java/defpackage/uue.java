package defpackage;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: uue */
public final class uue {
    public static final uue a = new uue();
    public final String b;
    public final arml c;
    public final Spanned d;
    public final aaft e;
    public final aaft f;

    public uue(String str, aanv aanv) {
        arml arml = aanv.a.c;
        if (arml == null) {
            arml = arml.f;
        }
        aaft b = aanv.b();
        if (aanv.b == null) {
            aoer aoer = aanv.a;
            if ((aoer.a & 2048) != 0) {
                aygk aygk = aoer.j;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                aanv.b = new aaft(aygk);
            }
        }
        this(str, arml, b, aanv.b);
    }

    uue(String str, String str2, Uri uri) {
        this.b = str2;
        this.c = null;
        this.d = !TextUtils.isEmpty(str) ? new SpannableStringBuilder(str) : null;
        this.e = uri != null ? new aaft(uri) : null;
        this.f = null;
    }

    public uue(String str, arml arml, aaft aaft, aaft aaft2) {
        this.b = xvd.a(str);
        this.c = (arml) amqw.a((Object) arml);
        this.d = ajqy.a(arml);
        this.e = aaft;
        this.f = aaft2;
    }

    private uue() {
        this.b = "";
        this.c = null;
        this.d = new SpannableStringBuilder();
        this.e = null;
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uue) {
            uue uue = (uue) obj;
            return amqq.a(this.b, uue.b) && amqq.a(this.c, uue.c) && amqq.a(this.d, uue.d) && amqq.a(uue.a(this.e), uue.a(uue.e)) && amqq.a(uue.a(this.f), uue.a(uue.f));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, uue.a(this.e), uue.a(this.f)});
    }

    private static aygk a(aaft aaft) {
        return aaft != null ? aaft.d() : null;
    }

    public final String toString() {
        amqo a = amql.a(this);
        a.a("accountEmail", this.b);
        a.a("accountNameProto", this.c);
        a.a("accountName", this.d);
        a.a("accountPhotoThumbnails", uue.a(this.e));
        a.a("mobileBannerThumbnails", uue.a(this.f));
        return a.toString();
    }
}
