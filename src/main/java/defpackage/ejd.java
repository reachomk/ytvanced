package defpackage;

/* renamed from: ejd */
public enum ejd {
    NONE,
    WATCH_WHILE_MINIMIZED,
    WATCH_WHILE_MAXIMIZED,
    WATCH_WHILE_FULLSCREEN,
    WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED,
    WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED,
    INLINE,
    INLINE_FULLSCREEN,
    INLINE_MUTED,
    INLINE_CAROUSEL,
    VIRTUAL_REALITY_FULLSCREEN,
    WATCH_WHILE_PICTURE_IN_PICTURE;

    public final boolean a() {
        return this == WATCH_WHILE_FULLSCREEN || this == VIRTUAL_REALITY_FULLSCREEN || this == INLINE_FULLSCREEN || this == WATCH_WHILE_PICTURE_IN_PICTURE;
    }

    public final boolean b() {
        return this == WATCH_WHILE_MINIMIZED || this == WATCH_WHILE_MAXIMIZED || this == WATCH_WHILE_FULLSCREEN || this == WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || this == WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED || this == WATCH_WHILE_PICTURE_IN_PICTURE;
    }

    public final boolean c() {
        return this == WATCH_WHILE_MAXIMIZED || this == WATCH_WHILE_FULLSCREEN;
    }

    public final boolean d() {
        return this == WATCH_WHILE_MINIMIZED || this == WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED;
    }

    public final boolean e() {
        return this == WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED || this == WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED;
    }

    public final boolean f() {
        return d() || e();
    }

    public final boolean g() {
        return this == INLINE || this == INLINE_FULLSCREEN || this == INLINE_CAROUSEL || h();
    }

    public final boolean h() {
        return this == INLINE_MUTED;
    }

    public final boolean i() {
        return this == INLINE_CAROUSEL;
    }

    public final boolean j() {
        return h() || i();
    }

    public final boolean k() {
        return this == VIRTUAL_REALITY_FULLSCREEN;
    }

    public final boolean l() {
        return this != NONE;
    }

    public final boolean m() {
        return !l() || g();
    }

    public final boolean n() {
        return this == WATCH_WHILE_PICTURE_IN_PICTURE;
    }

    public final ejd a(boolean z) {
        if (!(a() == z || k() || n())) {
            if (z) {
                if (b()) {
                    return WATCH_WHILE_FULLSCREEN;
                }
                if (g()) {
                    return INLINE_FULLSCREEN;
                }
            } else if (b()) {
                return WATCH_WHILE_MAXIMIZED;
            } else {
                if (g()) {
                    return INLINE;
                }
            }
        }
        return this;
    }
}
