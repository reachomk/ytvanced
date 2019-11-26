package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aivk */
public final class aivk {
    private final Builder a;
    private final Set b = new HashSet();
    private final /* synthetic */ aivi c;

    aivk(aivi aivi, String str) {
        this.c = aivi;
        Builder scheme = new Builder().scheme("http");
        int localPort = aivi.f.getLocalPort();
        StringBuilder stringBuilder = new StringBuilder(21);
        stringBuilder.append("localhost:");
        stringBuilder.append(localPort);
        this.a = scheme.encodedAuthority(stringBuilder.toString()).path(str);
    }

    public final aivk a(String str, long j) {
        a(str, Long.toString(j));
        return this;
    }

    public final synchronized aivk a(String str, String str2) {
        amqw.b(this.b.contains(str) ^ 1);
        Builder builder = this.a;
        if (str2 == null) {
            str2 = "";
        }
        builder.appendQueryParameter(str, str2);
        this.b.add(str);
        return this;
    }

    public final synchronized Uri a() {
        aiwc aiwc;
        Builder builder;
        aiwc = this.c.d;
        builder = this.a;
        return builder.appendQueryParameter("sig", aiwc.a(builder.appendQueryParameter("sparams", TextUtils.join(",", this.b)).build())).build();
    }
}
