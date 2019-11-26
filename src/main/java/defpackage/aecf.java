package defpackage;

import java.util.Locale;

/* renamed from: aecf */
final class aecf implements aech {
    private final /* synthetic */ aeca a;

    aecf(aeca aeca) {
        this.a = aeca;
    }

    public final void a(int i, int i2) {
        aeca aeca = this.a;
        String.format(Locale.getDefault(), "currentIndex:%d totalVideos:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        aeca.a(i, i2);
    }
}
