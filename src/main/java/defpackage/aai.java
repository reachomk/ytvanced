package defpackage;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aai */
public final class aai extends AccessibilityDelegate {
    public final aaj a;

    aai(aaj aaj) {
        this.a = aaj;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.d(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        View view2 = view;
        aca a = aca.a(accessibilityNodeInfo);
        boolean K = abe.K(view);
        if (VERSION.SDK_INT >= 28) {
            a.a.setScreenReaderFocusable(K);
        } else {
            a.a(1, K);
        }
        Boolean bool = (Boolean) new abi(Boolean.class).b(view2);
        K = bool != null ? bool.booleanValue() : false;
        if (VERSION.SDK_INT >= 28) {
            a.a.setHeading(K);
        } else {
            a.a(2, K);
        }
        CharSequence L = abe.L(view);
        if (VERSION.SDK_INT >= 28) {
            a.a.setPaneTitle(L);
        } else {
            a.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", L);
        }
        this.a.a(view2, a);
        CharSequence text = accessibilityNodeInfo.getText();
        if (VERSION.SDK_INT < 26) {
            int i;
            String str = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
            a.a.getExtras().remove(str);
            String str2 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
            a.a.getExtras().remove(str2);
            String str3 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
            a.a.getExtras().remove(str3);
            String str4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
            a.a.getExtras().remove(str4);
            SparseArray c = aca.c(view);
            if (c != null) {
                ArrayList arrayList = new ArrayList();
                for (i = 0; i < c.size(); i++) {
                    if (((WeakReference) c.valueAt(i)).get() == null) {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
                for (i = 0; i < arrayList.size(); i++) {
                    c.remove(((Integer) arrayList.get(i)).intValue());
                }
            }
            ClickableSpan[] c2 = aca.c(text);
            if (c2 != null && c2.length > 0) {
                a.k().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray c3 = aca.c(view);
                if (c3 == null) {
                    c3 = new SparseArray();
                    view2.setTag(R.id.tag_accessibility_clickable_spans, c3);
                }
                for (i = 0; i < c2.length; i++) {
                    int keyAt;
                    Object obj = c2[i];
                    for (int i2 = 0; i2 < c3.size(); i2++) {
                        if (obj.equals((ClickableSpan) ((WeakReference) c3.valueAt(i2)).get())) {
                            keyAt = c3.keyAt(i2);
                            break;
                        }
                    }
                    keyAt = aca.c;
                    aca.c = keyAt + 1;
                    c3.put(keyAt, new WeakReference(c2[i]));
                    Object obj2 = c2[i];
                    Spanned spanned = (Spanned) text;
                    a.a(str).add(Integer.valueOf(spanned.getSpanStart(obj2)));
                    a.a(str2).add(Integer.valueOf(spanned.getSpanEnd(obj2)));
                    a.a(str3).add(Integer.valueOf(spanned.getSpanFlags(obj2)));
                    a.a(str4).add(Integer.valueOf(keyAt));
                }
            }
        }
        List b = aaj.b(view);
        for (int i3 = 0; i3 < b.size(); i3++) {
            a.a((acd) b.get(i3));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(viewGroup, view, accessibilityEvent);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.a.a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        ace a = this.a.a(view);
        if (a == null) {
            return null;
        }
        return (AccessibilityNodeProvider) a.a;
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.a(view, i, bundle);
    }
}
