package com.consultoraestrategia.ss_crmeducativo.mainCursosDocente;

import com.consultoraestrategia.ss_crmeducativo.mainCursosDocente.events.ListCursosEvent;

/**
 * Created by irvinmarin on 27/02/2017.
 */

public interface MainCursosPresenter {

    void onCreate();
    void onDestroy();
    void OnEventMainThread(ListCursosEvent event);
}
