package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aca */
public final class aca {
    public static int c;
    public final AccessibilityNodeInfo a;
    public int b = -1;

    private aca(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    public static aca a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new aca(accessibilityNodeInfo);
    }

    public static aca a(View view) {
        return aca.a(AccessibilityNodeInfo.obtain(view));
    }

    public static aca a() {
        return aca.a(AccessibilityNodeInfo.obtain());
    }

    public static aca a(aca aca) {
        return aca.a(AccessibilityNodeInfo.obtain(aca.a));
    }

    public final int b() {
        return this.a.getActions();
    }

    public final void a(int i) {
        this.a.addAction(i);
    }

    public final List a(String str) {
        List integerArrayList = this.a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void a(acd acd) {
        if (VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityAction) acd.c);
        }
    }

    public final void b(View view) {
        this.a.setParent(view);
    }

    public final void a(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public final void b(Rect rect) {
        this.a.setBoundsInParent(rect);
    }

    public final void c(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public final void d(Rect rect) {
        this.a.setBoundsInScreen(rect);
    }

    public final void a(boolean z) {
        this.a.setCheckable(z);
    }

    public final boolean c() {
        return this.a.isChecked();
    }

    public final void b(boolean z) {
        this.a.setChecked(z);
    }

    public final boolean d() {
        return this.a.isFocusable();
    }

    public final void c(boolean z) {
        this.a.setFocusable(z);
    }

    public final void d(boolean z) {
        this.a.setVisibleToUser(z);
    }

    public final void e(boolean z) {
        this.a.setAccessibilityFocused(z);
    }

    public final void f(boolean z) {
        this.a.setClickable(true);
    }

    public final boolean e() {
        return this.a.isEnabled();
    }

    public final void g(boolean z) {
        this.a.setEnabled(z);
    }

    public final boolean f() {
        return this.a.isPassword();
    }

    public final boolean g() {
        return this.a.isScrollable();
    }

    public final void h(boolean z) {
        this.a.setScrollable(z);
    }

    public final CharSequence h() {
        return this.a.getClassName();
    }

    public final void a(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public final CharSequence i() {
        String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
        if ((a(str).isEmpty() ^ 1) == 0) {
            return this.a.getText();
        }
        List a = a(str);
        List a2 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List a3 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List a4 = a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        int i = 0;
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.a.getText(), 0, this.a.getText().length()));
        while (i < a.size()) {
            spannableString.setSpan(new abw(((Integer) a4.get(i)).intValue(), this, k().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) a.get(i)).intValue(), ((Integer) a2.get(i)).intValue(), ((Integer) a3.get(i)).intValue());
            i++;
        }
        return spannableString;
    }

    public final void b(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public static SparseArray c(View view) {
        return (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
    }

    public static ClickableSpan[] c(CharSequence charSequence) {
        return charSequence instanceof Spanned ? (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class) : null;
    }

    public final CharSequence j() {
        return this.a.getContentDescription();
    }

    public final void d(CharSequence charSequence) {
        this.a.setContentDescription(charSequence);
    }

    public final void a(Object obj) {
        this.a.setCollectionItemInfo(obj != null ? (CollectionItemInfo) ((acf) obj).a : null);
    }

    public final Bundle k() {
        return this.a.getExtras();
    }

    public final void i(boolean z) {
        this.a.setDismissable(z);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        return accessibilityNodeInfo != null ? accessibilityNodeInfo.hashCode() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aca aca = (aca) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            if (aca.a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(aca.a)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        c(rect);
        stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInScreen: ");
        stringBuilder2.append(rect);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.a.getPackageName());
        stringBuilder.append("; className: ");
        stringBuilder.append(h());
        stringBuilder.append("; text: ");
        stringBuilder.append(i());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(j());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(this.a.getViewIdResourceName());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.a.isCheckable());
        stringBuilder.append("; checked: ");
        stringBuilder.append(c());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(d());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.a.isFocused());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.a.isSelected());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.a.isClickable());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.a.isLongClickable());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(e());
        stringBuilder.append("; password: ");
        stringBuilder.append(f());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("; scrollable: ");
        stringBuilder3.append(g());
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; [");
        int b = b();
        while (b != 0) {
            String str;
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ -1;
            if (numberOfTrailingZeros == 1) {
                str = "ACTION_FOCUS";
            } else if (numberOfTrailingZeros != 2) {
                switch (numberOfTrailingZeros) {
                    case 4:
                        str = "ACTION_SELECT";
                        break;
                    case 8:
                        str = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str = "ACTION_CLICK";
                        break;
                    case 32:
                        str = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case 128:
                        str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str = "ACTION_SCROLL_BACKWARD";
                        break;
                    case 16384:
                        str = "ACTION_COPY";
                        break;
                    case 32768:
                        str = "ACTION_PASTE";
                        break;
                    case 65536:
                        str = "ACTION_CUT";
                        break;
                    case 131072:
                        str = "ACTION_SET_SELECTION";
                        break;
                    default:
                        str = "ACTION_UNKNOWN";
                        break;
                }
            } else {
                str = "ACTION_CLEAR_FOCUS";
            }
            stringBuilder.append(str);
            if (b != 0) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void a(int i, boolean z) {
        Bundle k = k();
        if (k != null) {
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
            int i2 = k.getInt(str, 0) & (i ^ -1);
            if (!z) {
                i = 0;
            }
            k.putInt(str, i | i2);
        }
    }
}
