package com.consultoraestrategia.ss_crmeducativo.tabsCursoAlumno;

import com.consultoraestrategia.ss_crmeducativo.tabsCursoDocente.events.TabsCursoEvent;

/**
 * Created by irvinmarin on 27/02/2017.
 */

public interface TabsCursoAlumnoPresenter {

  void onCreate();
  void onDestroy();
  void OnEventMainThread(TabsCursoEvent event);
}
