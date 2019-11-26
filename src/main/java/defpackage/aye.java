package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* renamed from: aye */
final class aye extends ayf {
    private final TextView a;
    private final axz b;

    aye(TextView textView) {
        this.a = textView;
        this.b = new axz(textView);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        TransformationMethod transformationMethod = this.a.getTransformationMethod();
        if (transformationMethod != null && !(transformationMethod instanceof PasswordTransformationMethod)) {
            TextView textView = this.a;
            if (!(transformationMethod instanceof ayi)) {
                transformationMethod = new ayi(transformationMethod);
            }
            textView.setTransformationMethod(transformationMethod);
        }
    }

    /* Access modifiers changed, original: final */
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        for (InputFilter inputFilter : inputFilterArr) {
            if (inputFilter instanceof axz) {
                return inputFilterArr;
            }
        }
        InputFilter[] inputFilterArr2 = new InputFilter[(inputFilterArr.length + 1)];
        System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, r0);
        inputFilterArr2[r0] = this.b;
        return inputFilterArr2;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (z) {
            a();
        }
    }
}
