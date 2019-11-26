package defpackage;

import android.hardware.Camera.Size;
import java.util.Comparator;

/* renamed from: abyj */
final /* synthetic */ class abyj implements Comparator {
    private final int a;

    abyj(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int abs = Math.abs(i - ((size.width * 1000) / size.height));
        i = Math.abs(i - ((size2.width * 1000) / size2.height));
        return abs == i ? (size2.width * size2.height) - (size.width * size.height) : abs - i;
    }
}
