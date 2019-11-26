package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: uuf */
public abstract class uuf {
    private static final boolean[][] f = new boolean[][]{new boolean[]{false, false, false, true, false, false, true, true}, new boolean[]{false, false, false, true, false, false, false, false}, new boolean[]{false, false, false, true, false, false, false, false}, new boolean[]{false, false, true, true, false, false, false, false}, new boolean[]{false, false, false, true, false, true, true, true}, new boolean[]{false, false, false, true, false, false, false, false}, new boolean[]{false, true, true, true, true, true, false, true}, new boolean[]{false, true, true, true, true, true, true, false}};
    public final aaas a;
    public final Set b = Collections.newSetFromMap(new WeakHashMap());
    public InlineAuthCommandOuterClass$InlineAuthCommand c = null;
    public FingerprintAuthRendererOuterClass$FingerprintAuthRenderer d = null;
    public PasswordAuthRendererOuterClass$PasswordAuthRenderer e = null;
    private int g = 0;
    private final Handler h;
    private final uvn i;

    public uuf(aaas aaas, Handler handler, uvn uvn) {
        this.a = aaas;
        this.h = handler;
        this.i = uvn;
    }

    public abstract void a(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);

    public abstract void a(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer);

    public abstract void a(uvl uvl);

    /* Access modifiers changed, original: protected */
    public void b() {
        throw null;
    }

    /* Access modifiers changed, original: protected */
    public void c() {
        throw null;
    }

    public void a(InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand) {
        if (this.g != 0) {
            a(3);
            return;
        }
        this.c = inlineAuthCommandOuterClass$InlineAuthCommand;
        anxp anxp = inlineAuthCommandOuterClass$InlineAuthCommand.f;
        if (anxp == null) {
            anxp = axak.a;
        }
        anxr access$000 = anxl.checkIsLite(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
        anxp.a(access$000);
        aaas aaas;
        if (anxp.h.a(access$000.d)) {
            anxp = inlineAuthCommandOuterClass$InlineAuthCommand.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$0002 = anxl.checkIsLite(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
            anxp.a(access$0002);
            Object b = anxp.h.b(access$0002.d);
            if (b == null) {
                b = access$0002.b;
            } else {
                b = access$0002.a(b);
            }
            this.e = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) b;
            if ((inlineAuthCommandOuterClass$InlineAuthCommand.a & 4) != 0) {
                aaas = this.a;
                apxu apxu = inlineAuthCommandOuterClass$InlineAuthCommand.d;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
            if (inlineAuthCommandOuterClass$InlineAuthCommand.g.size() != 0) {
                axak axak = (axak) inlineAuthCommandOuterClass$InlineAuthCommand.g.get(0);
                anxr access$0003 = anxl.checkIsLite(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.fingerprintAuthRenderer);
                axak.a(access$0003);
                Object b2;
                if (axak.h.a(access$0003.d)) {
                    access$0003 = anxl.checkIsLite(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.fingerprintAuthRenderer);
                    axak.a(access$0003);
                    b2 = axak.h.b(access$0003.d);
                    if (b2 == null) {
                        b2 = access$0003.b;
                    } else {
                        b2 = access$0003.a(b2);
                    }
                    this.d = (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer) b2;
                } else {
                    access$0003 = anxl.checkIsLite(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
                    axak.a(access$0003);
                    if (axak.h.a(access$0003.d)) {
                        access$0003 = anxl.checkIsLite(PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer);
                        axak.a(access$0003);
                        b2 = axak.h.b(access$0003.d);
                        if (b2 == null) {
                            b2 = access$0003.b;
                        } else {
                            b2 = access$0003.a(b2);
                        }
                        this.e = (PasswordAuthRendererOuterClass$PasswordAuthRenderer) b2;
                    }
                }
                if (a()) {
                    a(6);
                    return;
                } else {
                    a(7);
                    return;
                }
            }
            a(7);
            return;
        }
        if ((inlineAuthCommandOuterClass$InlineAuthCommand.a & 8) != 0) {
            aaas = this.a;
            apxu apxu2 = inlineAuthCommandOuterClass$InlineAuthCommand.e;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas.a(apxu2, null);
        }
        a(3);
    }

    public final boolean a() {
        return this.d != null && this.i.a();
    }

    public final void a(int i) {
        int i2 = this.g;
        this.g = i;
        if (f[i2][i]) {
            switch (i) {
                case 1:
                    b();
                    return;
                case 2:
                    c();
                    return;
                case 3:
                    for (uum uum : this.b) {
                        if (uum != null) {
                            uum.d();
                        }
                    }
                    a(2);
                    return;
                case 4:
                    this.h.post(new uui(this));
                    return;
                case 5:
                    for (uum uum2 : this.b) {
                        if (uum2 != null) {
                            uum2.e();
                        }
                    }
                    InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.c;
                    if ((inlineAuthCommandOuterClass$InlineAuthCommand.a & 8) != 0) {
                        aaas aaas = this.a;
                        apxu apxu = inlineAuthCommandOuterClass$InlineAuthCommand.e;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        aaas.a(apxu, null);
                    }
                    return;
                case 6:
                    this.h.post(new uuh(this));
                    return;
                default:
                    this.h.post(new uuk(this));
                    return;
            }
        }
        a(3);
    }
}
