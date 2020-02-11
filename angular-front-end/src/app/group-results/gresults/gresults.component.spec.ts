import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GresultsComponent } from './gresults.component';

describe('GresultsComponent', () => {
  let component: GresultsComponent;
  let fixture: ComponentFixture<GresultsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GresultsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GresultsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
