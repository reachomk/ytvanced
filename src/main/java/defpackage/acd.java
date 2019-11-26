package defpackage;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

/* renamed from: acd */
public final class acd {
    public static final acd a = new acd(1, null);
    public static final acd b = new acd(16, null);
    public final Object c;
    public final aci d;

    public acd(int i, CharSequence charSequence) {
        this(null, i, charSequence);
    }

    private acd(int i, Class cls) {
        this(null, i, null);
    }

    private acd(Object obj, int i, CharSequence charSequence) {
        this.d = null;
        if (VERSION.SDK_INT >= 21 && obj == null) {
            this.c = new AccessibilityAction(i, charSequence);
        } else {
            this.c = obj;
        }
    }

    public final int a() {
        return VERSION.SDK_INT >= 21 ? ((AccessibilityAction) this.c).getId() : 0;
    }

    static {
        acd acd = new acd(2, null);
        acd = new acd(4, null);
        acd = new acd(8, null);
        acd = new acd(32, null);
        acd = new acd(64, null);
        acd = new acd(128, null);
        acd = new acd(256, ack.class);
        acd = new acd(512, ack.class);
        acd = new acd(1024, acn.class);
        acd = new acd(2048, acn.class);
        acd = new acd(4096, null);
        acd = new acd(8192, null);
        acd = new acd(16384, null);
        acd = new acd(32768, null);
        acd = new acd(65536, null);
        acd = new acd(131072, acm.class);
        acd = new acd(262144, null);
        acd = new acd(524288, null);
        acd = new acd(1048576, null);
        acd = new acd(2097152, acp.class);
        acd = new acd(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null);
        acd = new acd(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null);
        acd = new acd(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null);
        acd = new acd(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null);
        acd = new acd(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null);
        acd = new acd(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null);
        acd = new acd(VERSION.SDK_INT >= 23 ? AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null);
        acd = new acd(VERSION.SDK_INT >= 24 ? AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null);
        acd = new acd(VERSION.SDK_INT >= 26 ? AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null);
        acd = new acd(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null);
        acd = new acd(VERSION.SDK_INT >= 28 ? AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null);
    }
}
