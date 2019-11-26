package defpackage;

import android.view.accessibility.AccessibilityRecord;

/* renamed from: acj */
public final class acj {
    public final AccessibilityRecord a;

    @Deprecated
    public acj(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        return accessibilityRecord != null ? accessibilityRecord.hashCode() : 0;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        acj acj = (acj) obj;
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            if (acj.a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(acj.a)) {
            return false;
        }
        return true;
    }
}
