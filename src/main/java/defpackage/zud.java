package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: zud */
public final class zud {
    public final ajwh a;
    public final zug b;
    public zun c;
    private List d;

    public zud(ajwh ajwh) {
        this.a = ajwh;
        ajwi ajwi = ajwh.b;
        if (ajwi.e != null) {
            this.b = zug.COLLABORATOR_CARD;
        } else if (ajwi.c != null) {
            this.b = zug.PLAYLIST_CARD;
        } else if (ajwi.a != null) {
            this.b = zug.SIMPLE_CARD;
        } else if (ajwi.d != null) {
            this.b = zug.VIDEO_CARD;
        } else if (ajwi.b != null) {
            this.b = zug.MOVIE_CARD;
        } else if (ajwi.f != null) {
            this.b = zug.EPISODE_CARD;
        } else if (ajwi.g != null) {
            this.b = zug.POLL_CARD;
            this.c = new zun(ajwi.g);
        } else if (ajwi.h == null) {
            xtl.c("Encountered unknown or invalid card");
            this.b = null;
        } else {
            this.b = zug.SHOPPING_CARD;
        }
    }

    public final arxr a() {
        arwz arwz = this.a.a;
        if (arwz == null) {
            return null;
        }
        arxr arxr = arwz.b;
        if (arxr == null) {
            arxr = arxr.h;
        }
        return arxr;
    }

    public final arwn b() {
        return this.a.b.e;
    }

    public final arxf c() {
        return this.a.b.c;
    }

    public final arxp d() {
        return this.a.b.a;
    }

    public final arxt e() {
        return this.a.b.d;
    }

    public final arxb f() {
        return this.a.b.b;
    }

    public final arwp g() {
        return this.a.b.f;
    }

    public final arxl h() {
        return this.a.b.h;
    }

    public final List i() {
        if (this.d == null) {
            this.d = Arrays.asList(this.a.c);
        }
        return this.d;
    }

    public final byte[] j() {
        arwr arwr = this.a.d;
        if (arwr == null || (arwr.a & 2) == 0) {
            return null;
        }
        arwx arwx = arwr.c;
        if (arwx == null) {
            arwx = arwx.c;
        }
        return arwx.b.d();
    }
}
