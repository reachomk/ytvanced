package defpackage;

import android.os.Build.VERSION;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.Window.Callback;
import java.util.List;

/* renamed from: aew */
final class aew extends aih {
    private final /* synthetic */ aek b;

    aew(aek aek, Callback callback) {
        this.b = aek;
        super(callback);
    }

    public final void onContentChanged() {
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.b.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            aek aek = this.b;
            int keyCode = keyEvent.getKeyCode();
            ads d = aek.d();
            if (d == null || !d.a(keyCode, keyEvent)) {
                afc afc = aek.l;
                if (afc == null || !aek.a(afc, keyEvent.getKeyCode(), keyEvent)) {
                    if (aek.l == null) {
                        afc = aek.e(0);
                        aek.a(afc, keyEvent);
                        boolean a = aek.a(afc, keyEvent.getKeyCode(), keyEvent);
                        afc.k = false;
                        if (!a) {
                            return false;
                        }
                    }
                    return false;
                }
                afc afc2 = aek.l;
                if (afc2 != null) {
                    afc2.l = true;
                }
            }
        }
        return true;
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof aiw)) {
            return super.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        aiw aiw = menu instanceof aiw ? (aiw) menu : null;
        if (i == 0 && aiw == null) {
            return false;
        }
        if (aiw != null) {
            aiw.j = true;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (aiw != null) {
            aiw.j = false;
        }
        return onPreparePanel;
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        super.onMenuOpened(i, menu);
        aek aek = this.b;
        if (i == 108) {
            ads d = aek.d();
            if (d != null) {
                d.e(true);
            }
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
        aek aek = this.b;
        if (i == 108) {
            ads d = aek.d();
            if (d != null) {
                d.e(false);
            }
        } else if (i == 0) {
            afc e = aek.e(0);
            if (e.m) {
                aek.a(e, false);
            }
        }
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (VERSION.SDK_INT >= 23) {
            return null;
        }
        if (this.b.j) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback);
    }

    private final ActionMode a(ActionMode.Callback callback) {
        aib aib = new aib(this.b.a, callback);
        aek aek = this.b;
        ahv ahv = aek.e;
        if (ahv != null) {
            ahv.c();
        }
        ahu aeu = new aeu(aek, aib);
        ads d = aek.d();
        if (d != null) {
            aek.e = d.a(aeu);
            if (aek.e != null) {
                aei aei = aek.c;
                if (aei != null) {
                    aei.b_();
                }
            }
        }
        if (aek.e == null) {
            aek.e = aek.a(aeu);
        }
        ahv ahv2 = aek.e;
        return ahv2 != null ? aib.b(ahv2) : null;
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        if (this.b.j && i == 0) {
            return a(callback);
        }
        return super.onWindowStartingActionMode(callback, i);
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        afc e = this.b.e(0);
        if (e != null) {
            aiw aiw = e.h;
            if (aiw != null) {
                super.onProvideKeyboardShortcuts(list, aiw, i);
                return;
            }
        }
        super.onProvideKeyboardShortcuts(list, menu, i);
    }
}
