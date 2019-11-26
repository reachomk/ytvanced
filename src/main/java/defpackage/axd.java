package defpackage;

import android.os.Build.VERSION;
import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.view.KeyEvent;

/* renamed from: axd */
final class axd {
    public final axq a;
    public final boolean b;
    public final int[] c;
    private final axc d = new axc();

    axd(axq axq, boolean z, int[] iArr) {
        this.a = axq;
        this.b = z;
        this.c = iArr;
    }

    public static boolean a(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z) {
        if ((KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) ^ 1) == 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!axd.a(selectionStart, selectionEnd)) {
                axe[] axeArr = (axe[]) editable.getSpans(selectionStart, selectionEnd, axe.class);
                if (axeArr != null) {
                    if (r3 > 0) {
                        for (Object obj : axeArr) {
                            int spanStart = editable.getSpanStart(obj);
                            int spanEnd = editable.getSpanEnd(obj);
                            if (z) {
                                if (spanStart == selectionStart) {
                                    editable.delete(spanStart, spanEnd);
                                    return true;
                                }
                            } else if (spanEnd == selectionStart) {
                                editable.delete(spanStart, spanEnd);
                                return true;
                            }
                            if (selectionStart > spanStart && selectionStart < spanEnd) {
                                editable.delete(spanStart, spanEnd);
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void a(Spannable spannable, axa axa, int i, int i2) {
        spannable.setSpan(new axs(axa), i, i2, 33);
    }

    public final boolean a(CharSequence charSequence, int i, int i2, axa axa) {
        if (VERSION.SDK_INT < 23) {
            bfc a = axa.a();
            int a2 = a.a(8);
            if ((a2 != 0 ? a.b.getShort(a2 + a.a) : (short) 0) > VERSION.SDK_INT) {
                return false;
            }
        }
        if (axa.c == 0) {
            axc axc = this.d;
            if (axc.a.get() == null) {
                axc.a.set(new StringBuilder());
            }
            StringBuilder stringBuilder = (StringBuilder) axc.a.get();
            stringBuilder.setLength(0);
            while (i < i2) {
                stringBuilder.append(charSequence.charAt(i));
                i++;
            }
            axa.c = !sf.a(axc.b, stringBuilder.toString()) ? 1 : 2;
        }
        if (axa.c == 2) {
            return true;
        }
        return false;
    }
}
