import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KoresultsComponent } from './koresults.component';

describe('KoresultsComponent', () => {
  let component: KoresultsComponent;
  let fixture: ComponentFixture<KoresultsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KoresultsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KoresultsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
