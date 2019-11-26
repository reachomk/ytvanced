package defpackage;

import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* renamed from: adf */
public final class adf extends aaj {
    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (nestedScrollView.isEnabled()) {
            int paddingBottom;
            if (i == 4096) {
                i = nestedScrollView.getHeight();
                paddingBottom = nestedScrollView.getPaddingBottom();
                i = Math.min(nestedScrollView.getScrollY() + ((i - paddingBottom) - nestedScrollView.getPaddingTop()), nestedScrollView.a());
                if (i != nestedScrollView.getScrollY()) {
                    nestedScrollView.a(i);
                    return true;
                }
            } else if (i != 8192) {
                return false;
            } else {
                i = nestedScrollView.getHeight();
                paddingBottom = nestedScrollView.getPaddingBottom();
                i = Math.max(nestedScrollView.getScrollY() - ((i - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (i == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.a(i);
                return true;
            }
        }
        return false;
    }

    public final void a(View view, aca aca) {
        super.a(view, aca);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        aca.a(ScrollView.class.getName());
        if (nestedScrollView.isEnabled()) {
            int a = nestedScrollView.a();
            if (a > 0) {
                aca.h(true);
                if (nestedScrollView.getScrollY() > 0) {
                    aca.a(8192);
                }
                if (nestedScrollView.getScrollY() < a) {
                    aca.a(4096);
                }
            }
        }
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.a() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.a());
    }
}
