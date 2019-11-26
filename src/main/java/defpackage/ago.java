package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

/* renamed from: ago */
class ago extends agn {
    public int[][] E;

    ago(ago ago, agp agp, Resources resources) {
        super(ago, agp, resources);
        if (ago != null) {
            this.E = ago.E;
        } else {
            this.E = new int[this.e.length][];
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void a() {
        int length = this.E.length;
        int[][] iArr = new int[length][];
        while (true) {
            length--;
            if (length >= 0) {
                Object obj = this.E[length];
                iArr[length] = obj != null ? (int[]) obj.clone() : null;
            } else {
                this.E = iArr;
                return;
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final int b(int[] iArr) {
        int[][] iArr2 = this.E;
        int i = this.f;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    public Drawable newDrawable() {
        return new agp(this, null);
    }

    public Drawable newDrawable(Resources resources) {
        return new agp(this, resources);
    }

    public final void b(int i, int i2) {
        Drawable[] drawableArr = new Drawable[i2];
        System.arraycopy(this.e, 0, drawableArr, 0, i);
        this.e = drawableArr;
        int[][] iArr = new int[i2][];
        System.arraycopy(this.E, 0, iArr, 0, i);
        this.E = iArr;
    }
}
