package defpackage;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Handler;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;

/* renamed from: uuu */
public final class uuu extends uuf {
    private final FragmentManager f;
    private uut g;

    public uuu(aaas aaas, Handler handler, uvp uvp, Activity activity) {
        super(aaas, handler, uvp);
        this.f = activity.getFragmentManager();
    }

    public final void a(InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand) {
        String str = "INLINE_AUTH_FRAGMENT_TAG";
        this.g = (uut) this.f.findFragmentByTag(str);
        uut uut = this.g;
        if (uut == null) {
            uut = new uut();
            uut.b = this;
            this.g = uut;
            this.f.beginTransaction().add(this.g, str).commit();
        } else if (!uut.isVisible()) {
            this.g.b = this;
            this.f.beginTransaction().show(this.g).commit();
        }
        super.a(inlineAuthCommandOuterClass$InlineAuthCommand);
    }

    public final void d() {
        this.g.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer) {
        uut uut = this.g;
        uut.c();
        uut.a(fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(PasswordAuthRendererOuterClass$PasswordAuthRenderer passwordAuthRendererOuterClass$PasswordAuthRenderer) {
        uut uut = this.g;
        uut.c();
        uut.a(passwordAuthRendererOuterClass$PasswordAuthRenderer);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(uvl uvl) {
        uut uut = this.g;
        uut.c();
        uut.a(uvl);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        for (uum uum : this.b) {
            if (uum != null) {
                uum.b();
            }
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.c;
        if (!(inlineAuthCommandOuterClass$InlineAuthCommand == null || (inlineAuthCommandOuterClass$InlineAuthCommand.a & 1) == 0)) {
            aaas aaas = this.a;
            apxu apxu = inlineAuthCommandOuterClass$InlineAuthCommand.b;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        this.g.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        for (uum uum : this.b) {
            if (uum != null) {
                uum.c();
            }
        }
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = this.c;
        if (!(inlineAuthCommandOuterClass$InlineAuthCommand == null || (inlineAuthCommandOuterClass$InlineAuthCommand.a & 2) == 0)) {
            aaas aaas = this.a;
            apxu apxu = inlineAuthCommandOuterClass$InlineAuthCommand.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, null);
        }
        this.g.b();
    }
}
