package com.consultoraestrategia.ss_crmeducativo.mainCursosAlumno;

import com.consultoraestrategia.ss_crmeducativo.mainCursosDocente.events.ListCursosEvent;

/**
 * Created by irvinmarin on 27/02/2017.
 */

public interface MainCursosAlumnoPresenter {

    void onCreate();
    void onDestroy();
    void OnEventMainThread(ListCursosEvent event);
}
