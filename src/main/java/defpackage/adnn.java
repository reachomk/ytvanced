package defpackage;

import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: adnn */
final class adnn implements aikd, aike, aikg {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    public final Set c = new HashSet();
    public boolean d = true;

    public final void a(int i, int i2, int i3) {
        if (this.d) {
            String.format(Locale.getDefault(), "onItemRangeInserted | listType: %1$d | positionStart: %2$d | itemCount: %3$d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            for (aike a : this.a) {
                a.a(i, i2, i3);
            }
        }
    }

    public final void a(int i) {
        if (this.d) {
            Locale locale = Locale.getDefault();
            r1 = new Object[4];
            Integer valueOf = Integer.valueOf(0);
            r1[1] = valueOf;
            r1[2] = valueOf;
            r1[3] = Integer.valueOf(i);
            String.format(locale, "onItemRangeMoved | fromListType: %1$d | fromPosition: %2$d | toListType: %3$d | toPosition: %4$d", r1);
            for (aike a : this.a) {
                a.a(i);
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        if (this.d) {
            String.format(Locale.getDefault(), "onItemRangeRemoved | listType: %1$d | positionStart: %2$d | itemCount: %3$d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            for (aike b : this.a) {
                b.b(i, i2, i3);
            }
        }
    }

    public final void a(int i, int i2) {
        if (this.d) {
            String.format(Locale.getDefault(), "onPlaybackPositionChanged | oldPosition: %1$d | newPosition: %2$d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
            for (aikg a : this.c) {
                a.a(i, i2);
            }
        }
    }

    /* synthetic */ adnn() {
    }
}
