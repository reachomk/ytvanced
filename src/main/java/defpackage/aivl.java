package defpackage;

import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: aivl */
public final class aivl implements Runnable {
    private final ExecutorService a = Executors.newFixedThreadPool(2, new xaf("mediaConn"));
    private final /* synthetic */ aivi b;

    public aivl(aivi aivi) {
        this.b = aivi;
    }

    public final void run() {
        while (!Thread.interrupted()) {
            try {
                this.a.execute(new aivn(this.b, this.b.f.accept()));
            } catch (SocketException e) {
                if (!e.getMessage().equals("Socket closed")) {
                    xtl.a("SocketException when accepting a new connection", e);
                }
                this.a.shutdownNow();
                return;
            } catch (IOException e2) {
                xtl.a("IOException when accepting a new connection", e2);
                this.a.shutdownNow();
                return;
            } catch (NoSuchFieldError e22) {
                xtl.a("NoSuchFieldError when accepting a new connection", e22);
                this.a.shutdownNow();
                return;
            } catch (Throwable e222) {
                this.a.shutdownNow();
                throw e222;
            }
        }
        this.a.shutdownNow();
    }
}
