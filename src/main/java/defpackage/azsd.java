package defpackage;

/* renamed from: azsd */
public enum azsd implements anxv {
    ACCESSIBILITY_TRAIT_UNKNOWN(0),
    ACCESSIBILITY_TRAIT_NONE(1),
    ACCESSIBILITY_TRAIT_BUTTON(2),
    ACCESSIBILITY_TRAIT_LINK(3),
    ACCESSIBILITY_TRAIT_IMAGE(4),
    ACCESSIBILITY_TRAIT_PLAYS_SOUND(5),
    ACCESSIBILITY_TRAIT_STATIC_TEXT(6),
    ACCESSIBILITY_TRAIT_NOT_ENABLED(7),
    ACCESSIBILITY_TRAIT_UPDATES_FREQUENTLY(8),
    ACCESSIBILITY_TRAIT_ADJUSTABLE(9),
    ACCESSIBILITY_TRAIT_SELECTED(10);
    
    public final int a;

    public final int getNumber() {
        return this.a;
    }

    public static azsd a(int i) {
        switch (i) {
            case 0:
                return ACCESSIBILITY_TRAIT_UNKNOWN;
            case 1:
                return ACCESSIBILITY_TRAIT_NONE;
            case 2:
                return ACCESSIBILITY_TRAIT_BUTTON;
            case 3:
                return ACCESSIBILITY_TRAIT_LINK;
            case 4:
                return ACCESSIBILITY_TRAIT_IMAGE;
            case 5:
                return ACCESSIBILITY_TRAIT_PLAYS_SOUND;
            case 6:
                return ACCESSIBILITY_TRAIT_STATIC_TEXT;
            case 7:
                return ACCESSIBILITY_TRAIT_NOT_ENABLED;
            case 8:
                return ACCESSIBILITY_TRAIT_UPDATES_FREQUENTLY;
            case 9:
                return ACCESSIBILITY_TRAIT_ADJUSTABLE;
            case 10:
                return ACCESSIBILITY_TRAIT_SELECTED;
            default:
                return null;
        }
    }

    private azsd(int i) {
        this.a = i;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }
}
