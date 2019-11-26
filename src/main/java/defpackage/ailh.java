package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ailh */
final class ailh extends ailq {
    private bcpu a;
    private amul b;
    private amul c;

    ailh() {
    }

    public final ailq a(bcpu bcpu) {
        if (bcpu != null) {
            this.a = bcpu;
            return this;
        }
        throw new NullPointerException("Null delayBetweenAnimationsInSequence");
    }

    public final ailq a(List list) {
        this.b = amul.a((Collection) list);
        return this;
    }

    public final ailq b(List list) {
        this.c = amul.a((Collection) list);
        return this;
    }

    public final ailp a() {
        String str = "";
        if (this.a == null) {
            str = str.concat(" delayBetweenAnimationsInSequence");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" views");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" animationSteps");
        }
        if (str.isEmpty()) {
            return new aili(this.a, this.b, this.c);
        }
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
