package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: aaj */
public class aaj {
    private static final AccessibilityDelegate b = new AccessibilityDelegate();
    public final AccessibilityDelegate a;
    private final AccessibilityDelegate c;

    public aaj() {
        this(b);
    }

    public aaj(AccessibilityDelegate accessibilityDelegate) {
        this.c = accessibilityDelegate;
        this.a = new aai(this);
    }

    public void a(View view, int i) {
        this.c.sendAccessibilityEvent(view, i);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean d(View view, AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, aca aca) {
        this.c.onInitializeAccessibilityNodeInfo(view, aca.a);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public ace a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.c.getAccessibilityNodeProvider(view);
        return accessibilityNodeProvider != null ? new ace(accessibilityNodeProvider) : null;
    }

    public boolean a(View view, int i, Bundle bundle) {
        List b = aaj.b(view);
        boolean z = false;
        for (int i2 = 0; i2 < b.size(); i2++) {
            acd acd = (acd) b.get(i2);
            if (acd.a() == i) {
                aci aci = acd.d;
                break;
            }
        }
        boolean performAccessibilityAction = this.c.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != R.id.accessibility_action_clickable_span) {
            return performAccessibilityAction;
        }
        i = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null) {
            WeakReference weakReference = (WeakReference) sparseArray.get(i);
            if (weakReference != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    ClickableSpan[] c = aca.c(view.createAccessibilityNodeInfo().getText());
                    int i3 = 0;
                    while (c != null && i3 < c.length) {
                        if (clickableSpan.equals(c[i3])) {
                            clickableSpan.onClick(view);
                            z = true;
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return z;
    }

    static List b(View view) {
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }
}
