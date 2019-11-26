package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: jre */
public final class jre {
    public final View a;
    private final ValueAnimator b;

    public jre(int i, int i2, View view, jrf jrf, int i3) {
        amqw.a((Object) view);
        amqw.a((Object) jrf);
        if (view.getLayoutParams() == null) {
            afpc.a(2, afpf.main, "FeedFilterBar HeightAnimator instantiated with null target view.");
            throw new IllegalArgumentException("Target view layout params are null.");
        } else if (view.getVisibility() != 0) {
            afpc.a(2, afpf.main, "FeedFilterBar HeightAnimator instantiated with non-visible target view.");
            throw new IllegalArgumentException("Target view not visible.");
        } else if (view.getLayoutParams().height != i) {
            i2 = view.getLayoutParams().height;
            StringBuilder stringBuilder = new StringBuilder(76);
            stringBuilder.append("Target view height does not match expected height (");
            stringBuilder.append(i2);
            stringBuilder.append("!=");
            stringBuilder.append(i);
            stringBuilder.append(")");
            String stringBuilder2 = stringBuilder.toString();
            afpf afpf = afpf.main;
            String valueOf = String.valueOf(stringBuilder2);
            String str = "FeedFilterBar HeightAnimator ";
            afpc.a(1, afpf, valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            throw new IllegalArgumentException(stringBuilder2);
        } else {
            this.a = view;
            this.b = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.b.setStartDelay((long) i3);
            this.b.setDuration(400);
            this.b.setInterpolator(acr.a(0.5f, 0.0f, 0.0f, 1.0f));
            this.b.addUpdateListener(new jrd(this, i, i2));
            this.b.addListener(new jrg(jrf));
        }
    }

    public final void a() {
        this.b.start();
    }
}
