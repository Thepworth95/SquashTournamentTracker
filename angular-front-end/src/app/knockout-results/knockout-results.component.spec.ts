import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { KnockoutResultsComponent } from './knockout-results.component';

describe('KnockoutResultsComponent', () => {
  let component: KnockoutResultsComponent;
  let fixture: ComponentFixture<KnockoutResultsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KnockoutResultsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KnockoutResultsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
