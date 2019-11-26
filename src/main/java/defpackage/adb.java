package defpackage;

import android.os.Bundle;

/* renamed from: adb */
final class adb extends ace {
    private final /* synthetic */ ada b;

    adb(ada ada) {
        this.b = ada;
    }

    public final aca a(int i) {
        return aca.a(this.b.a(i));
    }

    public final boolean a(int i, int i2, Bundle bundle) {
        boolean c;
        ada ada = this.b;
        boolean z = false;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    c = ada.c(i);
                } else if (i2 != 64) {
                    if (i2 != 128) {
                        c = ada.c(i, i2);
                    } else {
                        c = ada.b(i);
                    }
                } else if (ada.b.isEnabled() && ada.b.isTouchExplorationEnabled()) {
                    i2 = ada.d;
                    if (i2 != i) {
                        if (i2 != aocf.UNSET_ENUM_VALUE) {
                            ada.b(i2);
                        }
                        ada.d = i;
                        ada.c.invalidate();
                        ada.a(i, 32768);
                        z = true;
                    }
                }
            } else if (ada.c.isFocused() || ada.c.requestFocus()) {
                i2 = ada.e;
                if (i2 != i) {
                    if (i2 != aocf.UNSET_ENUM_VALUE) {
                        ada.c(i2);
                    }
                    if (i != aocf.UNSET_ENUM_VALUE) {
                        ada.e = i;
                        ada.a(i, 8);
                        return true;
                    }
                }
            }
            return z;
        }
        c = abe.a(ada.c, i2, bundle);
        z = c;
        return z;
    }

    public final aca b(int i) {
        if (i != 2) {
            i = this.b.e;
        } else {
            i = this.b.d;
        }
        if (i == aocf.UNSET_ENUM_VALUE) {
            return null;
        }
        return a(i);
    }
}
