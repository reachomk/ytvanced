package defpackage;

import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bam */
public final class bam {
    public final Bundle a;
    public List b;
    private List c;

    bam(Bundle bundle) {
        this.a = bundle;
    }

    public final String a() {
        return this.a.getString("id");
    }

    public final List b() {
        if (this.c == null) {
            this.c = this.a.getStringArrayList("groupMemberIds");
            if (this.c == null) {
                this.c = Collections.emptyList();
            }
        }
        return this.c;
    }

    public final String c() {
        return this.a.getString("name");
    }

    public final String d() {
        return this.a.getString("status");
    }

    public final Uri e() {
        String string = this.a.getString("iconUri");
        return string != null ? Uri.parse(string) : null;
    }

    public final boolean f() {
        return this.a.getBoolean("enabled", true);
    }

    public final int g() {
        return this.a.getInt("connectionState", 0);
    }

    public final boolean h() {
        return this.a.getBoolean("canDisconnect", false);
    }

    public final IntentSender i() {
        return (IntentSender) this.a.getParcelable("settingsIntent");
    }

    public final List j() {
        t();
        return this.b;
    }

    private final void t() {
        if (this.b == null) {
            this.b = this.a.getParcelableArrayList("controlFilters");
            if (this.b == null) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final int k() {
        return this.a.getInt("playbackType", 1);
    }

    public final int l() {
        return this.a.getInt("playbackStream", -1);
    }

    public final int m() {
        return this.a.getInt("deviceType");
    }

    public final int n() {
        return this.a.getInt("volume");
    }

    public final int o() {
        return this.a.getInt("volumeMax");
    }

    public final int p() {
        return this.a.getInt("volumeHandling", 0);
    }

    public final int q() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public final Bundle r() {
        return this.a.getBundle("extras");
    }

    public final boolean s() {
        t();
        return (TextUtils.isEmpty(a()) || TextUtils.isEmpty(c()) || this.b.contains(null)) ? false : true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteDescriptor{ id=");
        stringBuilder.append(a());
        stringBuilder.append(", groupMemberIds=");
        stringBuilder.append(b());
        stringBuilder.append(", name=");
        stringBuilder.append(c());
        stringBuilder.append(", description=");
        stringBuilder.append(d());
        stringBuilder.append(", iconUri=");
        stringBuilder.append(e());
        stringBuilder.append(", isEnabled=");
        stringBuilder.append(f());
        stringBuilder.append(", isConnecting=");
        stringBuilder.append(this.a.getBoolean("connecting", false));
        stringBuilder.append(", connectionState=");
        stringBuilder.append(g());
        stringBuilder.append(", controlFilters=");
        stringBuilder.append(Arrays.toString(j().toArray()));
        stringBuilder.append(", playbackType=");
        stringBuilder.append(k());
        stringBuilder.append(", playbackStream=");
        stringBuilder.append(l());
        stringBuilder.append(", deviceType=");
        stringBuilder.append(m());
        stringBuilder.append(", volume=");
        stringBuilder.append(n());
        stringBuilder.append(", volumeMax=");
        stringBuilder.append(o());
        stringBuilder.append(", volumeHandling=");
        stringBuilder.append(p());
        stringBuilder.append(", presentationDisplayId=");
        stringBuilder.append(q());
        stringBuilder.append(", extras=");
        stringBuilder.append(r());
        stringBuilder.append(", isValid=");
        stringBuilder.append(s());
        stringBuilder.append(", minClientVersion=");
        stringBuilder.append(this.a.getInt("minClientVersion", 1));
        stringBuilder.append(", maxClientVersion=");
        stringBuilder.append(this.a.getInt("maxClientVersion", Integer.MAX_VALUE));
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public static bam a(Bundle bundle) {
        return bundle != null ? new bam(bundle) : null;
    }
}
