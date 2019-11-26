package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: bal */
public final class bal {
    public final Bundle a;
    private ArrayList b;
    private ArrayList c;

    public bal(String str, String str2) {
        this.a = new Bundle();
        this.a.putString("id", str);
        this.a.putString("name", str2);
    }

    public bal(bam bam) {
        if (bam != null) {
            this.a = new Bundle(bam.a);
            if (!bam.b().isEmpty()) {
                this.b = new ArrayList(bam.b());
            }
            if (!bam.j().isEmpty()) {
                this.c = new ArrayList(bam.b);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("descriptor must not be null");
    }

    public final bal a(boolean z) {
        this.a.putBoolean("enabled", z);
        return this;
    }

    public final bal a(int i) {
        this.a.putInt("connectionState", i);
        return this;
    }

    public final bal a(IntentFilter intentFilter) {
        if (intentFilter != null) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (!this.c.contains(intentFilter)) {
                this.c.add(intentFilter);
            }
            return this;
        }
        throw new IllegalArgumentException("filter must not be null");
    }

    public final bal a(Collection collection) {
        if (collection != null) {
            if (!collection.isEmpty()) {
                for (IntentFilter a : collection) {
                    a(a);
                }
            }
            return this;
        }
        throw new IllegalArgumentException("filters must not be null");
    }

    public final bal b(int i) {
        this.a.putInt("playbackType", i);
        return this;
    }

    public final bal c(int i) {
        this.a.putInt("deviceType", i);
        return this;
    }

    public final bal d(int i) {
        this.a.putInt("volume", i);
        return this;
    }

    public final bal e(int i) {
        this.a.putInt("volumeMax", i);
        return this;
    }

    public final bal f(int i) {
        this.a.putInt("volumeHandling", i);
        return this;
    }

    public final bal g(int i) {
        this.a.putInt("presentationDisplayId", i);
        return this;
    }

    public final bam a() {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            this.a.putParcelableArrayList("controlFilters", arrayList);
        }
        arrayList = this.b;
        if (arrayList != null) {
            this.a.putStringArrayList("groupMemberIds", arrayList);
        }
        return new bam(this.a);
    }
}
