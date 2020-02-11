import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KofixturesComponent } from './kofixtures.component';

describe('KofixturesComponent', () => {
  let component: KofixturesComponent;
  let fixture: ComponentFixture<KofixturesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KofixturesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KofixturesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
